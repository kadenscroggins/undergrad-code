<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class NutritionForm
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
        Me.lblCarb = New System.Windows.Forms.Label()
        Me.lblFood = New System.Windows.Forms.Label()
        Me.lblFat = New System.Windows.Forms.Label()
        Me.lblCalories = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.btnClose = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lblCarb
        '
        Me.lblCarb.AutoSize = True
        Me.lblCarb.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCarb.Location = New System.Drawing.Point(87, 103)
        Me.lblCarb.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblCarb.Name = "lblCarb"
        Me.lblCarb.Size = New System.Drawing.Size(100, 17)
        Me.lblCarb.TabIndex = 0
        '
        'lblFood
        '
        Me.lblFood.AutoSize = True
        Me.lblFood.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFood.Location = New System.Drawing.Point(87, 13)
        Me.lblFood.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblFood.Name = "lblFood"
        Me.lblFood.Size = New System.Drawing.Size(100, 17)
        Me.lblFood.TabIndex = 1
        '
        'lblFat
        '
        Me.lblFat.AutoSize = True
        Me.lblFat.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFat.Location = New System.Drawing.Point(87, 70)
        Me.lblFat.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblFat.Name = "lblFat"
        Me.lblFat.Size = New System.Drawing.Size(100, 17)
        Me.lblFat.TabIndex = 2
        '
        'lblCalories
        '
        Me.lblCalories.AutoSize = True
        Me.lblCalories.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCalories.Location = New System.Drawing.Point(87, 41)
        Me.lblCalories.MinimumSize = New System.Drawing.Size(100, 15)
        Me.lblCalories.Name = "lblCalories"
        Me.lblCalories.Size = New System.Drawing.Size(100, 17)
        Me.lblCalories.TabIndex = 3
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(47, 15)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(34, 15)
        Me.Label5.TabIndex = 4
        Me.Label5.Text = "Food"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(32, 41)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(49, 15)
        Me.Label6.TabIndex = 5
        Me.Label6.Text = "Calories"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(21, 72)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(60, 15)
        Me.Label7.TabIndex = 6
        Me.Label7.Text = "Fat Grams"
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(12, 103)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(69, 15)
        Me.Label8.TabIndex = 7
        Me.Label8.Text = "Carb Grams"
        '
        'btnClose
        '
        Me.btnClose.Location = New System.Drawing.Point(66, 139)
        Me.btnClose.Name = "btnClose"
        Me.btnClose.Size = New System.Drawing.Size(75, 23)
        Me.btnClose.TabIndex = 8
        Me.btnClose.Text = "Close"
        Me.btnClose.UseVisualStyleBackColor = True
        '
        'NutritionForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(213, 190)
        Me.Controls.Add(Me.btnClose)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.lblCalories)
        Me.Controls.Add(Me.lblFat)
        Me.Controls.Add(Me.lblFood)
        Me.Controls.Add(Me.lblCarb)
        Me.Name = "NutritionForm"
        Me.Text = "NutritionForm"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblCarb As Label
    Friend WithEvents lblFood As Label
    Friend WithEvents lblFat As Label
    Friend WithEvents lblCalories As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents btnClose As Button
End Class
