package ait.computer.dao;

import ait.computer.model.Computer;

public interface Store {
    Computer findPCByProcessor(String processor);
    Computer findPCByRAM(int RAM);

}
