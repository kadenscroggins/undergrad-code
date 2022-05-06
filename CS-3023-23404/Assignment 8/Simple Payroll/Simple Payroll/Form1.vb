Public Class Form1
    Private Sub btnCalcPay_Click(sender As Object, e As EventArgs) Handles btnCalcPay.Click
        Const decHOURLY_PAY_RATE As Decimal = 15D
        Const intMAX_SUBSCRIPT As Integer = 5

        Dim dblHoursArray(intMAX_SUBSCRIPT) As Double
        Dim intCount As Integer = 0
        Dim decEmpPay As Decimal

        MessageBox.Show("I'm going to ask you for each employee's hours worked.")

        Do While intCount < dblHoursArray.Length
            Try
                dblHoursArray(intCount) = CDbl(InputBox("Employee number " & (intCount + 1).ToString()))
                intCount += 1
            Catch
                MessageBox.Show("Enter a valid number of hours for that employee.")
            End Try
        Loop

        lstOutput.Items.Clear()

        For intCount = 0 To dblHoursArray.Length - 1
            decEmpPay = CDec(dblHoursArray(intCount) * decHOURLY_PAY_RATE)

            lstOutput.Items.Add("Employee " & (intCount + 1).ToString() & " earned " & decEmpPay.ToString("c"))
        Next
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class
