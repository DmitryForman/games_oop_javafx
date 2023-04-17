package ru.job4j.chess.firuges.black;

import com.sun.javafx.font.coretext.CTFactory;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        System.out.println(bishopBlack.position());


    }

    @Test
    public void wayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        Cell[] step = new Cell[]{Cell.D2,Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5)).isEqualTo(step);


    }

    @Test
    public void isDiagonal() {
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        System.out.println(bishopBlack.copy(Cell.A3));
    }
}