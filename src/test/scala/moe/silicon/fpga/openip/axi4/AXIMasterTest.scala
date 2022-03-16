package moe.silicon.fpga.openip.lcd_tcon

import chisel3._
import chisel3.tester.testableClock
import chiseltest.{ChiselScalatestTester, testableUInt}
import chiseltest.simulator.WriteVcdAnnotation
import org.scalatest.freespec.AnyFreeSpec
import moe.silicon.fpga.openip.axi4._
import moe.silicon.fpga.openip.util.BusState._

class AXIMasterTest extends AnyFreeSpec with ChiselScalatestTester {
  val axiparam = AXI4Param (
    idWidth = 12,
    addrWidth = 32,
    dataWidth = 32,
    burstWidth = 4, // ZYNQ-7000 Uses AXI3
    awuserWidth = 2,
    aruserWidth = 2,
    wuserWidth = 0,
    ruserWidth = 0,
    buserWidth = 0,
    isLite = false,
  )
}