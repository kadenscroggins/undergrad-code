<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class MainForm
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.btnDisplayForm = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'btnDisplayForm
        '
        Me.btnDisplayForm.Location = New System.Drawing.Point(33, 41)
        Me.btnDisplayForm.Name = "btnDisplayForm"
        Me.btnDisplayForm.Size = New System.Drawing.Size(91, 23)
        Me.btnDisplayForm.TabIndex = 0
        Me.btnDisplayForm.Text = "Display Form"
        Me.btnDisplayForm.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(130, 41)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(91, 23)
        Me.btnExit.TabIndex = 1
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'MainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(255, 102)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnDisplayForm)
        Me.Name = "MainForm"
        Me.Text = "Multiform Practice"
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents btnDisplayForm As Button
    Friend WithEvents btnExit As Button
End Class
