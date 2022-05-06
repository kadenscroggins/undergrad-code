Public Class Form1
    Private Sub mnuFileExit_Click(sender As Object, e As EventArgs) Handles mnuFileExit.Click
        Me.Close()
    End Sub

    Private Sub mnuPackagesScuba_Click(sender As Object, e As EventArgs) Handles mnuPackagesScuba.Click
        Dim frmScuba As New ScubaForm
        frmScuba.ShowDialog()
    End Sub

    Private Sub mnuPackagesSkyDiving_Click(sender As Object, e As EventArgs) Handles mnuPackagesSkyDiving.Click
        Dim frmSkyDive As New SkyDiveForm
        frmSkyDive.ShowDialog()
    End Sub

    Private Sub mnuHelpAbout_Click(sender As Object, e As EventArgs) Handles mnuHelpAbout.Click
        MessageBox.Show("High Adventure Travel Price Quote System Version 1.0")
    End Sub
End Class
