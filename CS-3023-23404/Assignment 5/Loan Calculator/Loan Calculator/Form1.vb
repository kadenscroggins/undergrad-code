Public Class Form1
    Const dblMONTHS_YEAR As Double = 12
    Const dblNEW_RATE As Double = 0.089
    Const dblUSED_RATE As Double = 0.095

    Dim dblAnnualRate As Double = dblNEW_RATE

    Private Sub btnCalculate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnCalculate.Click
        Dim dblVehicleCost As Double
        Dim dblDownPayment As Double
        Dim intMonths As Integer
        Dim dblLoan As Double
        Dim dblMonthlyPayment As Double
        Dim dblInterest As Double
        Dim dblPrincipal As Double
        Dim intCount As Integer
        Dim strOut As String
        Dim blnInputOk As Boolean = True

        If Not Double.TryParse(txtCost.Text, dblVehicleCost) Then
            lblMessage.Text = "Vehicle cost must be a number"
            blnInputOk = False
        End If

        If Not Double.TryParse(txtDownPayment.Text, dblDownPayment) Then
            lblMessage.Text = "Down Payment must be a number"
            blnInputOk = False
        End If

        If Not Integer.TryParse(txtMonths.Text, intMonths) Then
            lblMessage.Text = "Months must be an integer"
            blnInputOk = False
        End If

        If blnInputOk = True Then
            dblLoan = dblVehicleCost - dblDownPayment
            dblMonthlyPayment = Pmt(dblAnnualRate / dblMONTHS_YEAR, intMonths, -dblLoan)

            lstOutput.Items.Clear()
            lblMessage.Text = String.Empty
            For intCount = 1 To intMonths
                dblInterest = IPmt(dblAnnualRate / dblMONTHS_YEAR, intCount, intMonths, -dblLoan)
                dblPrincipal = PPmt(dblAnnualRate / dblMONTHS_YEAR, intCount, intMonths, -dblLoan)
                strOut = "Month " & intCount.ToString("d2")
                strOut &= ": payment = " & dblMonthlyPayment.ToString("n2")
                strOut &= ", interest = " & dblInterest.ToString("n2")
                strOut &= ", principal = " & dblPrincipal.ToString("n2")
                lstOutput.Items.Add(strOut)
            Next
        End If
    End Sub

    Private Sub btnClear_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnClear.Click
        dblAnnualRate = dblNEW_RATE
        txtCost.Clear()
        txtDownPayment.Clear()
        txtMonths.Clear()
        lstOutput.Items.Clear()
        lblAnnualRate.Text = dblNEW_RATE.ToString("p")
        radNew.Checked = True
        lblMessage.Text = String.Empty
        txtCost.Focus()
    End Sub

    Private Sub btnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub radNew_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radNew.CheckedChanged
        If radNew.Checked = True Then
            dblAnnualRate = dblNEW_RATE
            lblAnnualRate.Text = dblNEW_RATE.ToString("p")
        End If
    End Sub

    Private Sub radUsed_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radUsed.CheckedChanged
        If radUsed.Checked = True Then
            dblAnnualRate = dblUSED_RATE
            lblAnnualRate.Text = dblUSED_RATE.ToString("p")
        End If
    End Sub
End Class
