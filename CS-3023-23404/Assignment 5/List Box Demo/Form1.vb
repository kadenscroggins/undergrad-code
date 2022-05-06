Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub btnOk_Click(sender As Object, e As EventArgs) Handles btnOk.Click
        Dim strInput As String

        If lstMonths.SelectedIndex = -1 Then
            MessageBox.Show("Select a month.")
        ElseIf lstYears.SelectedIndex = -1 Then
            MessageBox.Show("Select a year.")
        Else
            strInput = lstMonths.SelectedItem.ToString() &
            " " & lstYears.SelectedItem.ToString()
            MessageBox.Show("You selected " & strInput)
        End If
    End Sub

    Private Sub btnReset_Click(sender As Object, e As EventArgs) Handles btnReset.Click
        lstMonths.SelectedIndex = -1
        lstYears.SelectedIndex = -1
    End Sub
End Class
