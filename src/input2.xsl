
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="/">
        <xsl:variable name="totalPrice" select="sum(//Items/@UnitPrice)"/>
        <xsl:text>UPDATED XML file along with Totalprice</xsl:text>
        <xsl:element name="Order">
            <xsl:copy-of select="."/>
            <xsl:element name="OverallTotal">
                <xsl:attribute name="Totalprice">
                    <xsl:value-of select="$totalPrice"/>
                </xsl:attribute>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>