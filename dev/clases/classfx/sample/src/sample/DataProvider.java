package sample;

import java.util.Collection;
public interface DataProvider<T> {
  Collection<T> getData();
}