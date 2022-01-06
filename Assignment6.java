package com.Java.generics;
import java.io.Serializable;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        out.println("1: Process an order");
        out.println("2: View all orders");
        out.println("3: Exit");
        
           while 
             {
            out.print("Make your choice: ");
            ch = sc.nextInt(); // reading user's choice
            switch (ch) {
                case 1: // for Process an order
                    out.print(" Process an order\n");
                    order = sc.nextInt();


                    break;
                case 2: // for View all orders
                    out.print(" View all orders \n");
                    order = sc.nextInt();
                    break;
                case 3: // for View all orders
                    out.print(" Exit \n");
                    order = sc.nextInt();
                    break;
                default:
                    out.println("Invalid choice! Please make a valid choice. \n\n");

            }
        }

              //object making

    }
}
                      class OrderFileProcessor {


                          public static void deSerializeOrder(){
                              try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("orders_ser"))) {
                                  Order order = (Order) oin.readObject();
                                  order.displayOrder();
                              } catch (IOException | ClassNotFoundException e) {
                                  e.printStackTrace();
                              }
                          }

                          public static void serializeOrder(Order order) {

                              try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("orders_ser"))) {
                                  oos.writeObject(order);
                              } catch (IOException e) {
                                  System.err.println("Serialization IO Error:" + e.getMessage());
                              }
                          }

                          public static void processOrder(Order order) {
                              try (PrintWriter out = new PrintWriter("orders")) {
                                  out.printf("Order Id: %d  %50s %n", order.getOrderId(), order.getCustomer());
                                  out.printf("%50s %n", "Items");
                                  for (Item item : order.getItems()) {
                                      out.printf("%20s %d %4.2f %4.2f %n", item.getName(), item.getQuantity(),
                                              item.getPrice(), item.getTotalCost());
                                  }
                                  out.printf(
                                          "============================================================================%n");
                                  out.printf("Net Total: %4.2f %n", order.getNetTotal());

                              } catch (IOException e) {
                                  System.err.println("File IO Error:" + e.getMessage());
                              } finally {
                                  System.out.println("Order processed successfully");
                              }
                          }

                      }

                       class Order implements Serializable {

                              private int OrderId;
                              private String Customer;
                              private List<Item> Items;
                              private double netTotal;

                           public Order(int OrderId, String Customer, List<Item> Items) {
                               this.OrderId = OrderId;
                               this.Customer = Customer;
                               this.Items = Items;
                               this.netTotal = 0;
                               for (Item item : Items) {
                                   netTotal += Item.getPrice();
                               }
                           }
                          // Getter setter;

                           public int getOrderId() {
                               return OrderId;
                           }
                               public string getCustomer() {
                                   return Customer;
                               }
                                   public List<Item> getItems() {
                                       return List < Item > Items;
                                   }
                                       public double getNetTotal() {
                                           return netTotal;
                                           }

                              public void setOrderId(int OrderId) {
                                  this.OrderId = OrderId;
                              }
                           public void setitems(int Items) {
                               this.Items = Items;
                           }
                           public void setCustomer(string Customer) {
                               this.Customer = Customer;
                           }
                           public void setNetTotal(double netTotal) {
                               this.netTotal = netTotal;
                           }

                           public void displayOrder() {

                               System.out.printf("Order Id: %d %50s %n", OrderId);
                               System.out.printf("Items: %d %50s %n", Items, Items);
                               System.out.printf("customer: %d %50s %n", Customer, Customer);
                               System.out.printf("netTotal: %d %50s %n", netTotal, netTotal);
                           }
                                }


                                  class Items implements Serializable {

                                      private int ItemCode;
                                      private String Name;
                                      private float UnitPrice;
                                      private int Quantity;
                                      private double TotalPrice;

                                      // Getter setter

                                      public int getItemCode() {
                                          return ItemCode;
                                      }

                                      public String getName() {
                                          return Name;
                                      }

                                      public float getUnitPrice() {
                                          return Price;
                                      }

                                      public int Quantity() {
                                          return Quantity;
                                      }

                                      public double getTotalPrice() {
                                          return TotalPrice;
                                      }

                                      public void setItemCode(int ItemCode) {
                                          this.ItemCode = ItemCode;
                                      }

                                      public void setName(int Name) {
                                          this.Name = Name;
                                      }

                                      public void setUnitPrice(int UnitPrice) {
                                          this.UnitPrice = UnitPrice;
                                      }

                                      public void Quantity(int Quantity) {
                                          this.Quantity = Quantity;
                                      }

                                      public void TotalPrice(int TotalPrice) {
                                          this.TotalPrice = TotalPrice;
                                      }
                                  }
