
import javax.swing.JOptionPane;
public class RectangleArea {
    public static void main(String[] args){
        RectangleArea rec = new RectangleArea();
        double length = rec.getLength();
        double width = rec.getWidth();
        double area = rec.getArea(length,width);
        JOptionPane.showMessageDialog(null, String.format("Length = %.2f\nWidth = %.2f\nArea = %.2f",length,width,area));
    }
    public double getWidth(){
        return Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the rectangle's width.","5"));
    }
    public double getLength(){
        return Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the rectangle's length.","10"));
    }
    public double getArea(double length, double width){
        return length*width;
    }
}
