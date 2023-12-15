package org.felipecpdev.domain;

public class AsusManufacturer extends Company{
    @Override
    public GPU createGpu() {
        return null;
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
