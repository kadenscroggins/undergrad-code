Module PriceCalcModule
    Public Const g_intMINIMUM_FOR_DISCOUNT As Integer = 5
    Public Const g_decDISCOUNT_PERCENTAGE As Decimal = 0.1D

    Public Function CalcDiscount(decTotal As Decimal) As Decimal
        Dim decDiscount As Decimal
        decDiscount = decTotal * g_decDISCOUNT_PERCENTAGE
        Return decDiscount
    End Function

End Module
