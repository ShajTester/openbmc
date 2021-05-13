SUMMARY = "Rikor rikfan"
DESCRIPTION = "Daemon to read or write rikfan mode"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/ShajTester/rikfan.git"
SRCREV = "081930fd3fa534329f988ed8f6f9b402c865f9be"

inherit cmake systemd
SYSTEMD_SERVICE_${PN} = "xyz.openbmc_project.rikfan.service"

DEPENDS = "boost sdbusplus phosphor-logging"
