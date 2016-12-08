# PoolShoppe
A social shopping network. More details [here](https://wth-sap.hackerearth.com/sprints/what-the-hack/dashboard/DanglingPointers/idea/)

## User Scenarios
### Online
**Persona**

1. User with limited budget looking for offers - Sonali, Ekta
2. E-commerce websites - Jabong

**Sonali's user story**

Jabong is providing an offer - Get a discount of 15% on a minimum purchase of Rs.1500. Sonali wants to avail the offer but she is on a tight budget and does not want to spend Rs.1500. She can use PoolShoppe to minimize her shopping expenditure. This is what she needs to
do:

1. Sonali logs into her PoolShoppe account.
2. She lands on the home page which shows her all the offers from across all shopping websites (Myntra, Jabong, Flipkart, Amazon, etc.)
3. She finds the specific offer which she is looking for (Get a discount of 15% on a minimum purchase of Rs.1500). She can also see how many other users are interested in the same offer.
4. She clicks on the offer and is navigated to the details page where she can see her cart (which will be empty)
5. On clicking a link she is navigated to the shopping website.
6. She selects a product of her choice (a t-shirt priced at Rs.900)
7. She copies the link of the product in the clipboard and returns back to the PoolShoppe application.
8. On navigating back to the application the copied link is read from the clipboard and the details of the selected product is fetched
9. Sonali gives the details about the product (size of the t-shirt, delivery address) and places the order.
10. While opting for delivery Sonali is asked if she would like to pick up her order from a nearby pickup point or get the order directly delivered to her preferred address.
11. Sonali selects the latter option, i.e. She asks for the order to be delivered to her address.
12. Like Sonali, Ekta also places an order for a jacket priced at Rs.700
13. But unlike Sonali, Ekta agrees to pick up her order from the pickup point.
14. Orders from Sonali and Ekta are clubbed together and a single order worth of Rs.1600 is placed. Since this order is eligible for discount of 15% amounting to Rs.240, PoolShoppe claims the discount from Jabong and distributes it to Ekta and Sonali in proportion of their shares.
15. Ekta now has to pay Rs.595 instead of Rs.700 and Sonali has to pay Rs.765 instead of Rs.900
16. Ekta and Sonali both pay PoolShoppe Rs.615[1] and Rs.815[2] respectively and get product worth of Rs.700 and Rs.900 each.

[1] Ekta pays an additional amount of Rs.20 as convenience fee

[2] Sonali pays an additional amount of Rs.50 as convenience fee + delivery charges.

### Offline
