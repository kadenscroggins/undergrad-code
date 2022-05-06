Public Class Form1
    Private Sub btnShowBack_Click(sender As Object, e As EventArgs) Handles btnShowBack.Click
        picCardBack.Visible = True
        picCardFace.Visible = False
    End Sub

    Private Sub btnShowFace_Click(sender As Object, e As EventArgs) Handles btnShowFace.Click
        picCardBack.Visible = False
        picCardFace.Visible = True
    End Sub
End Class
