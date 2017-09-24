# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "jethro"

LOCALVERSION = "-fslc"

SRCREV = "fd14401eb57291b3c9e734b46cff53f4f55ad633"

SRC_URI = "git://github.com/pablo-aledo/openrex-linux-3.14;branch=${SRCBRANCH} \
           file://defconfig"

# PV .= "+git${SRCPV}"
PV .= ""


COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
