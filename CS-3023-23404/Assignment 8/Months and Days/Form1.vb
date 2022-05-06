Public Class Form1
    Private Sub btnDisplay_Click(sender As Object, e As EventArgs) Handles btnDisplay.Click
        Dim strMonths() As String = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"}

        Dim intDays() As Integer = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}

        For intCount As Integer = 0 To strMonths.Length - 1
            lstOutput.Items.Add(strMonths(intCount) & " has " & intDays(intCount).ToString() & " days.")
        Next
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class
