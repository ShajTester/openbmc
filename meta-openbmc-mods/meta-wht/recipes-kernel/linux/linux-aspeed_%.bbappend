FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
        file://0083-Disable-kcs-in-dts.patch" \
        file://0081-Flash-layout-Rikor-32MB.patch \
        file://0001-Disable-mac0-for-intel-ast2500-dts.patch \
		"
