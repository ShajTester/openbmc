SUMMARY = "Rikor rikntp"
DESCRIPTION = "Daemon to read or write rikntp date and time"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/askourik/rikntp.git"
SRCREV = "285b83ab1795b8186093055c46d7c73d573ca735"

inherit cmake systemd
SYSTEMD_SERVICE_${PN} = "xyz.openbmc_project.rikntp.service"

DEPENDS = "boost sdbusplus phosphor-logging"
