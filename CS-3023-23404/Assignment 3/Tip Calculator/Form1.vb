Public Class Form1
    Private Sub btnFifteen_Click(sender As Object, e As EventArgs) Handles btnFifteen.Click
        Dim dblBill As Double = 0.0
        Dim dblTip As Double = 0.0

        dblBill = CDbl(txtBillAmount.Text)

        dblTip = dblBill * 0.15

        lblTip.Text = CStr(dblTip)
    End Sub

    Private Sub btnTwenty_Click(sender As Object, e As EventArgs) Handles btnTwenty.Click
        Dim dblBill As Double = 0.0
        Dim dblTip As Double = 0.0

        dblBill = CDbl(txtBillAmount.Text)

        dblTip = dblBill * 0.2

        lblTip.Text = CStr(dblTip)
    End Sub

    Private Sub btnTwentyFive_Click(sender As Object, e As EventArgs) Handles btnTwentyFive.Click
        Dim dblBill As Double = 0.0
        Dim dblTip As Double = 0.0

        dblBill = CDbl(txtBillAmount.Text)

        dblTip = dblBill * 0.25

        lblTip.Text = CStr(dblTip)
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class
