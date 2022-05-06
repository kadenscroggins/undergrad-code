<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Me.picCardBack = New System.Windows.Forms.PictureBox()
        Me.picCardFace = New System.Windows.Forms.PictureBox()
        Me.btnShowBack = New System.Windows.Forms.Button()
        Me.btnShowFace = New System.Windows.Forms.Button()
        CType(Me.picCardBack, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picCardFace, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picCardBack
        '
        Me.picCardBack.Image = Global.Card_Flip.My.Resources.Resources.Backface_Blue
        Me.picCardBack.Location = New System.Drawing.Point(12, 12)
        Me.picCardBack.Name = "picCardBack"
        Me.picCardBack.Size = New System.Drawing.Size(146, 210)
        Me.picCardBack.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.picCardBack.TabIndex = 0
        Me.picCardBack.TabStop = False
        '
        'picCardFace
        '
        Me.picCardFace.Image = Global.Card_Flip.My.Resources.Resources.Ace_Spades
        Me.picCardFace.Location = New System.Drawing.Point(168, 12)
        Me.picCardFace.Name = "picCardFace"
        Me.picCardFace.Size = New System.Drawing.Size(146, 210)
        Me.picCardFace.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.picCardFace.TabIndex = 1
        Me.picCardFace.TabStop = False
        Me.picCardFace.Visible = False
        '
        'btnShowBack
        '
        Me.btnShowBack.Location = New System.Drawing.Point(36, 228)
        Me.btnShowBack.Name = "btnShowBack"
        Me.btnShowBack.Size = New System.Drawing.Size(94, 49)
        Me.btnShowBack.TabIndex = 2
        Me.btnShowBack.Text = "Show the Card Back"
        Me.btnShowBack.UseVisualStyleBackColor = True
        '
        'btnShowFace
        '
        Me.btnShowFace.Location = New System.Drawing.Point(194, 228)
        Me.btnShowFace.Name = "btnShowFace"
        Me.btnShowFace.Size = New System.Drawing.Size(94, 49)
        Me.btnShowFace.TabIndex = 3
        Me.btnShowFace.Text = "Show the Card Front"
        Me.btnShowFace.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(326, 285)
        Me.Controls.Add(Me.btnShowFace)
        Me.Controls.Add(Me.btnShowBack)
        Me.Controls.Add(Me.picCardFace)
        Me.Controls.Add(Me.picCardBack)
        Me.Name = "Form1"
        Me.Text = "Card Flip"
        CType(Me.picCardBack, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picCardFace, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents picCardBack As PictureBox
    Friend WithEvents picCardFace As PictureBox
    Friend WithEvents btnShowBack As Button
    Friend WithEvents btnShowFace As Button
End Class
