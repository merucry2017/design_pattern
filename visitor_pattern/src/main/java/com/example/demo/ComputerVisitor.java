package com.example.demo;

public interface ComputerVisitor {
    void visitCPU(CPU cpu);
    void visitHarddisk(Harddisk harddisk);
}
