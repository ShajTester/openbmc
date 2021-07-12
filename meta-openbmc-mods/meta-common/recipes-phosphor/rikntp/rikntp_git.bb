SUMMARY = "Rikor rikntp"
DESCRIPTION = "Daemon to read or write rikntp date and time"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://github.com/askourik/rikntp.git"
SRCREV = "296ba1e4eb72259b79bee0f380c85e6a62c475d8"

inherit cmake systemd
SYSTEMD_SERVICE_${PN} = "xyz.openbmc_project.rikntp.service"

DEPENDS = "boost sdbusplus phosphor-logging"
