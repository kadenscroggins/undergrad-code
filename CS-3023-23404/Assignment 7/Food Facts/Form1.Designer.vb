<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.btnClose = New System.Windows.Forms.Button()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.lblCalories = New System.Windows.Forms.Label()
        Me.lblFat = New System.Windows.Forms.Label()
        Me.lblFood = New System.Windows.Forms.Label()
        Me.lblCarb = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'btnClose
        '
        Me.btnClose.Location = New System.Drawing.Point(80, 136)
        Me.btnClose.Name = "btnClose"
        Me.btnClose.Size = New System.Drawing.Size(75, 23)
        Me.btnClose.TabIndex = 17
        Me.btnClose.Text = "Close"
        Me.btnClose.UseVisualStyleBackColor = True
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(26, 100)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(69, 15)
        Me.Label8.TabIndex = 16
        Me.Label8.Text = "Carb Grams"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(35, 69)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(60, 15)
        Me.Label7.TabIndex = 15
        Me.Label7.Text = "Fat Grams"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(46, 38)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(49, 15)
        Me.Label6.TabIndex = 14
        Me.Label6.Text = "Calories"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(61, 12)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(34, 15)
        Me.Label5.TabIndex = 13
        Me.Label5.Text = "Food"
        '
        'lblCalories
        '
        Me.lblCalories.AutoSize = True
        Me.lblCalories.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCalories.Location = New System.Drawing.Point(101, 38)
        Me.lblCalories.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblCalories.Name = "lblCalories"
        Me.lblCalories.Size = New System.Drawing.Size(100, 17)
        Me.lblCalories.TabIndex = 12
        Me.lblCalories.Text = "100"
        '
        'lblFat
        '
        Me.lblFat.AutoSize = True
        Me.lblFat.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFat.Location = New System.Drawing.Point(101, 67)
        Me.lblFat.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblFat.Name = "lblFat"
        Me.lblFat.Size = New System.Drawing.Size(100, 17)
        Me.lblFat.TabIndex = 11
        Me.lblFat.Text = "0.4"
        '
        'lblFood
        '
        Me.lblFood.AutoSize = True
        Me.lblFood.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFood.Location = New System.Drawing.Point(101, 10)
        Me.lblFood.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblFood.Name = "lblFood"
        Me.lblFood.Size = New System.Drawing.Size(100, 17)
        Me.lblFood.TabIndex = 10
        Me.lblFood.Text = "1 banana"
        '
        'lblCarb
        '
        Me.lblCarb.AutoSize = True
        Me.lblCarb.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCarb.Location = New System.Drawing.Point(101, 100)
        Me.lblCarb.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblCarb.Name = "lblCarb"
        Me.lblCarb.Size = New System.Drawing.Size(100, 17)
        Me.lblCarb.TabIndex = 9
        Me.lblCarb.Text = "27"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(227, 169)
        Me.Controls.Add(Me.btnClose)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.lblCalories)
        Me.Controls.Add(Me.lblFat)
        Me.Controls.Add(Me.lblFood)
        Me.Controls.Add(Me.lblCarb)
        Me.Name = "Form1"
        Me.RightToLeftLayout = True
        Me.Text = "Nutritional Info"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnClose As Button
    Friend WithEvents Label8 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents lblCalories As Label
    Friend WithEvents lblFat As Label
    Friend WithEvents lblFood As Label
    Friend WithEvents lblCarb As Label
End Class
