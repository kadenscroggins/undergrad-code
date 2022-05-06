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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.btnExit = New System.Windows.Forms.Button()
        Me.btnSwitchLight = New System.Windows.Forms.Button()
        Me.lblLightState = New System.Windows.Forms.Label()
        Me.picLightOn = New System.Windows.Forms.PictureBox()
        Me.picLightOff = New System.Windows.Forms.PictureBox()
        CType(Me.picLightOn, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picLightOff, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.5!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(271, 278)
        Me.btnExit.Margin = New System.Windows.Forms.Padding(4)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(96, 37)
        Me.btnExit.TabIndex = 9
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'btnSwitchLight
        '
        Me.btnSwitchLight.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.5!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnSwitchLight.Location = New System.Drawing.Point(33, 278)
        Me.btnSwitchLight.Margin = New System.Windows.Forms.Padding(4)
        Me.btnSwitchLight.Name = "btnSwitchLight"
        Me.btnSwitchLight.Size = New System.Drawing.Size(135, 37)
        Me.btnSwitchLight.TabIndex = 7
        Me.btnSwitchLight.Text = "Switch Light"
        Me.btnSwitchLight.UseVisualStyleBackColor = True
        '
        'lblLightState
        '
        Me.lblLightState.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblLightState.Location = New System.Drawing.Point(89, 230)
        Me.lblLightState.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.lblLightState.Name = "lblLightState"
        Me.lblLightState.Size = New System.Drawing.Size(204, 28)
        Me.lblLightState.TabIndex = 6
        Me.lblLightState.Text = "ON"
        Me.lblLightState.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'picLightOn
        '
        Me.picLightOn.Image = CType(resources.GetObject("picLightOn.Image"), System.Drawing.Image)
        Me.picLightOn.Location = New System.Drawing.Point(33, 30)
        Me.picLightOn.Margin = New System.Windows.Forms.Padding(4)
        Me.picLightOn.Name = "picLightOn"
        Me.picLightOn.Size = New System.Drawing.Size(133, 180)
        Me.picLightOn.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picLightOn.TabIndex = 5
        Me.picLightOn.TabStop = False
        '
        'picLightOff
        '
        Me.picLightOff.Image = CType(resources.GetObject("picLightOff.Image"), System.Drawing.Image)
        Me.picLightOff.Location = New System.Drawing.Point(224, 30)
        Me.picLightOff.Margin = New System.Windows.Forms.Padding(4)
        Me.picLightOff.Name = "picLightOff"
        Me.picLightOff.Size = New System.Drawing.Size(143, 180)
        Me.picLightOff.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picLightOff.TabIndex = 8
        Me.picLightOff.TabStop = False
        Me.picLightOff.Visible = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(10.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(409, 336)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnSwitchLight)
        Me.Controls.Add(Me.lblLightState)
        Me.Controls.Add(Me.picLightOn)
        Me.Controls.Add(Me.picLightOff)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(4)
        Me.MaximizeBox = False
        Me.MinimizeBox = False
        Me.Name = "Form1"
        Me.Text = "Lights"
        CType(Me.picLightOn, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picLightOff, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents btnExit As System.Windows.Forms.Button
    Friend WithEvents btnSwitchLight As System.Windows.Forms.Button
    Friend WithEvents lblLightState As System.Windows.Forms.Label
    Friend WithEvents picLightOn As System.Windows.Forms.PictureBox
    Friend WithEvents picLightOff As System.Windows.Forms.PictureBox

End Class
