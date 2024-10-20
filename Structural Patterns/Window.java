// Component
interface Window {
    void draw(); // Draw the window
}

// Concrete Component
class SimpleWindow implements Window {
    public void draw() {
        System.out.println("Drawing a simple window");
    }
}

// Decorator
abstract class WindowDecorator implements Window {
    protected Window decoratedWindow;

    public WindowDecorator(Window window) {
        this.decoratedWindow = window;
    }

    public void draw() {
        decoratedWindow.draw();
    }
}

// Concrete Decorator
class ScrollableWindow extends WindowDecorator {
    public ScrollableWindow(Window window) {
        super(window);
    }

    public void draw() {
        super.draw();
        System.out.println("Adding scroll bars");
    }
}

public class Main {
    public static void main(String[] args) {
        Window window = new ScrollableWindow(new SimpleWindow());
        window.draw();
    }
}

