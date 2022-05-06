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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtBillAmount = New System.Windows.Forms.TextBox()
        Me.btnFifteen = New System.Windows.Forms.Button()
        Me.btnTwenty = New System.Windows.Forms.Button()
        Me.btnTwentyFive = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.lblTip = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(17, 22)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(108, 20)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Amount of Bill:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(17, 126)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(110, 20)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Amount To Tip:"
        '
        'txtBillAmount
        '
        Me.txtBillAmount.Location = New System.Drawing.Point(150, 22)
        Me.txtBillAmount.Name = "txtBillAmount"
        Me.txtBillAmount.Size = New System.Drawing.Size(125, 27)
        Me.txtBillAmount.TabIndex = 2
        '
        'btnFifteen
        '
        Me.btnFifteen.Location = New System.Drawing.Point(12, 70)
        Me.btnFifteen.Name = "btnFifteen"
        Me.btnFifteen.Size = New System.Drawing.Size(94, 29)
        Me.btnFifteen.TabIndex = 3
        Me.btnFifteen.Text = "15%"
        Me.btnFifteen.UseVisualStyleBackColor = True
        '
        'btnTwenty
        '
        Me.btnTwenty.Location = New System.Drawing.Point(112, 70)
        Me.btnTwenty.Name = "btnTwenty"
        Me.btnTwenty.Size = New System.Drawing.Size(94, 29)
        Me.btnTwenty.TabIndex = 4
        Me.btnTwenty.Text = "20%"
        Me.btnTwenty.UseVisualStyleBackColor = True
        '
        'btnTwentyFive
        '
        Me.btnTwentyFive.Location = New System.Drawing.Point(212, 70)
        Me.btnTwentyFive.Name = "btnTwentyFive"
        Me.btnTwentyFive.Size = New System.Drawing.Size(94, 29)
        Me.btnTwentyFive.TabIndex = 5
        Me.btnTwentyFive.Text = "25%"
        Me.btnTwentyFive.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(112, 161)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(94, 29)
        Me.btnExit.TabIndex = 6
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'lblTip
        '
        Me.lblTip.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.lblTip.Location = New System.Drawing.Point(150, 119)
        Me.lblTip.Name = "lblTip"
        Me.lblTip.Size = New System.Drawing.Size(125, 27)
        Me.lblTip.TabIndex = 7
        Me.lblTip.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(319, 203)
        Me.Controls.Add(Me.lblTip)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnTwentyFive)
        Me.Controls.Add(Me.btnTwenty)
        Me.Controls.Add(Me.btnFifteen)
        Me.Controls.Add(Me.txtBillAmount)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Tip Calculator"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents txtBillAmount As TextBox
    Friend WithEvents btnFifteen As Button
    Friend WithEvents btnTwenty As Button
    Friend WithEvents btnTwentyFive As Button
    Friend WithEvents btnExit As Button
    Friend WithEvents lblTip As Label
End Class
