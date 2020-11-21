package com.codewithscpark;

import com.codewithscpark.state.*;

public class Main {
    public static void main(String[] args) {
        var canvas = new CanvasV2();
        // canvas.setCurrentTool(new SelectionTool());
        // canvas.setCurrentTool(new BrushTool());
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
