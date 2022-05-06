Public Class Form1
    Sub TurnLightOn()
        picLightOn.Visible = True
        picLightOff.Visible = False
        lblLightState.Text = "ON"
    End Sub

    Sub TurnLightOff()
        picLightOff.Visible = True
        picLightOn.Visible = False
        lblLightState.Text = "OFF"
    End Sub

    Private Sub btnSwitchLight_Click(sender As Object, e As EventArgs) Handles btnSwitchLight.Click
        If picLightOn.Visible = True Then
            TurnLightOff()
        Else
            TurnLightOn()
        End If
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class
