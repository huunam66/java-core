package DTO;

public class PersionalComputer {
    private Monitor monitor;
    private ComputerCase computerCase;
    private KeyBoard keyBoard;

    public PersionalComputer() {
        this(null, null, null);
    }

    public PersionalComputer(Monitor monitor, ComputerCase computerCase, KeyBoard keyBoard) {
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.keyBoard = keyBoard;
    }

    public void show() {
        monitor.showScreen();
        keyBoard.show();
        computerCase.show();
    }
}
