//package stepDefinitions;
//
//import AmazonImplementation.Product;
//import AmazonImplementation.Search;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class SearchSteps {
//
//	Product product;
//	Search search;
//
//@Given("I have a search field on Amazon page")
//public void i_have_a_search_field_on_amazon_page(Scenario sc) {
//   System.out.println("Step 1");
//  
//}
//
//@When("I search a product with name {string} and price {int}")
//public void i_search_a_product_with_name_and_price(String productName, Integer price) {
//	System.out.println("Step 2 "+ productName +" of "+price); 
//	product = new Product(productName,price);
//}
//
//@Then("Product with name {string} should be displayed")
//public void product_with_name_should_be_displayed(String productName) {
//	search = new Search();
//	search.displayProduct(product);
//	System.out.println("Step 3 "+productName); 
//}
//}
