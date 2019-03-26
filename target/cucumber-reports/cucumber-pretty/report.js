$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cart.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Cart",
  "description": "",
  "id": "shopping-cart",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click home category button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click shop now",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click first item",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingCart.i_am_on_home_page()"
});
formatter.result({
  "duration": 2339177839,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCart.i_click_home_category_button()"
});
formatter.result({
  "duration": 7783651548,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCart.i_click_shop_now()"
});
formatter.result({
  "duration": 2808408851,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCart.i_click_first_item()"
});
formatter.result({
  "duration": 3861357710,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCart.i_click_Add_to_cart()"
});
formatter.result({
  "duration": 7947026527,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "I should be able to remove an item",
  "description": "",
  "id": "shopping-cart;i-should-be-able-to-remove-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I remove an item",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "item should be removed",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCart.i_remove_an_item()"
});
formatter.result({
  "duration": 8670631379,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCart.item_should_be_removed()"
});
formatter.result({
  "duration": 2065943304,
  "status": "passed"
});
});