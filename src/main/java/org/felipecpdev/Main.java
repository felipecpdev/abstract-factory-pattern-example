package org.felipecpdev;


import org.felipecpdev.domain.Company;
import org.felipecpdev.domain.GPU;
import org.felipecpdev.domain.Monitor;
import org.felipecpdev.domain.MsiManufacturer;

//TIP ejemplo de https://www.youtube.com/watch?v=QNpwWkdFvgQ
public class Main {
    public static void main(String[] args) {

        Company company= new MsiManufacturer();
        GPU gpu = company.createGpu();
        gpu.assemble();

        Monitor monitor = company.createMonitor();
        monitor.assemble();

    }
}