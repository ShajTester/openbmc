SUMMARY = "Email notifier"
DESCRIPTION = "Email notifier service by Rikor"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/ShajTester/rikmail.git;protocol=http"
SRCREV = "6473df44e2513a251c3224ad8c6fca05b4302178"

inherit cmake systemd
SYSTEMD_SERVICE_${PN} = "xyz.openbmc_project.rikmail.service"

DEPENDS = "boost sdbusplus phosphor-logging"

