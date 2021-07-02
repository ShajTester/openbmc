FILESEXTRAPATHS_prepend_intel := "${THISDIR}/${PN}:"

# SRC_URI = "git://github.com/Intel-BMC/phosphor-webui;protocol=ssh;branch=intel2"
# SRCREV = "7d6650577d28a52e7be47dd2106d9e0f3b6e1c59"

SRC_URI = "git://github.com/tohas1986/phosphor-webui.git;branch=rikorv3"
SRCREV = "c462927d639493939de9ce47dfbef52fdfcac31e"

SRC_URI += "file://lang.js"

do_install_append() {
	install -d ${D}/etc
	install -m 0644 ${WORKDIR}/lang.js ${D}/etc/lang.js
	ln -sf /etc/lang.js ${D}/usr/share/www
}

