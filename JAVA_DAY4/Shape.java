import java.util.*;
public abstract class Shape{
private int value;
public String getValue() {
    return value;
  }
public void setValue(String newValue) {
    this.value = newValue;
  }
abstract void calculateArea(int value);
}
