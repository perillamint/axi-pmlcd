package moe.silicon.fpga.openip.lcd_tcon

import chisel3._
import chisel3.util.Cat

class PMODWrapper extends Module {
    val pmod = IO(new Bundle {
        val j = Output(UInt(8.W))
    })
    val lcdport = IO(new PMLCD_IN)

    pmod.j := Cat (
        lcdport.data,
        lcdport.flm,
        lcdport.lp,
        lcdport.xscl,
        lcdport.m
    )
}