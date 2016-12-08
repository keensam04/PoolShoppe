# REST APIs for getting product details

## GET Offers
Response structure matches with that provided by Flipkart affiliate API. Refer to [original API response](https://affiliate.flipkart.com/api-docs/af_offer_ref.html)

### URL
```
/Offers
```

### Response body
```
{
  "allOffersList": [
    {
      "startTime": 1447785000000,
      "endTime": 1448821800000,
      "title": "Up to 30% off",
      "description": "From Formula1",
      "url": "http://dl.flipkart.com/dl/automotive/accessories-spare-parts/car-bike-care/pr?p%5B%5D=facets.brand%255B%255D%3DFormula%2B1&p%5B%5D=facets.brand%255B%255D%3DFormula1&sid=0hx%2Cbwd%2Cbyn&filterNone=true&affid=keshav",
      "category": "automotive",
      "imageUrls": [
        {
          "url": "http://img.fkcdn.com/image/scratch-remover-wax/a/h/v/formula-1-227-scratch-out-original-imae3728msy6fh4v.jpeg",
          "resolutionType": "default"
        },
        {
          "url": "https://rukminim1.flixcart.com/image/200/200/scratch-remover-wax/a/h/v/formula-1-227-scratch-out-original-imae3728msy6fh4v.jpeg?q=90",
          "resolutionType": "low"
        },
        {
          "url": "https://rukminim1.flixcart.com/image/400/400/scratch-remover-wax/a/h/v/formula-1-227-scratch-out-original-imae3728msy6fh4v.jpeg?q=90",
          "resolutionType": "mid"
        },
        {
          "url": "https://rukminim1.flixcart.com/image/800/800/scratch-remover-wax/a/h/v/formula-1-227-scratch-out-original-imae3728msy6fh4v.jpeg?q=90",
          "resolutionType": "high"
        }
      ],
      "availability": "LIVE",
      "offerCategory": 1,
      "provider": "Flipkart",
      "interestedUserCount": 72,
      "id": "123456",
      "offerType": "",
      "lat": "",
      "long": ""
    }
  ]
}
```

## POST Interest

### URL
```
/ShowInterest
```
### Response body
No response body

## GET Product by ID

### URL
```
/Product?id=<ProductID>
```
### Response body
```
{
  "productBaseInfoV1": {
    "productId": "TSHENH9UGMUYZJZZ",
    "title": "Rodid Solid Men's Round Neck Grey T-Shirt",
    "productDescription": "T-shirt from the house of RODID. Your skin will love the feel of this T-shirt as it is fashioned using the material that is famous for comfort. Add an extra dose of style wearing this T-Shirt. Comfort and roll with time as you adorn this T-Shirt fashioned using soft fabric. Team this T-Shirt with distressed jeans and leather sandals for a relaxed and cool look.",
    "imageUrls": {
      "200x200": "http://img.fkcdn.com/image/t-shirt/c/d/z/rodbn-cm-rodid-xl-200x200-imaenbuwd2dkfqxc.jpeg",
      "400x400": "http://img.fkcdn.com/image/t-shirt/c/d/z/rodbn-cm-rodid-xl-400x400-imaenbuwd2dkfqxc.jpeg",
      "800x800": "http://img.fkcdn.com/image/t-shirt/c/d/z/rodbn-cm-rodid-xl-800x800-imaenbuwd2dkfqxc.jpeg",
      "unknown": "http://img.fkcdn.com/image/t-shirt/c/d/z/rodbn-cm-rodid-xl-original-imaenbuwd2dkfqxc.jpeg"
    },
    "productFamily": [
      "TSHENBY6AWP5YZ2K",
      "TSHENBY6SGBAHQ2W",
      "TSHENH9XJG3ZUCDZ"
    ],
    "maximumRetailPrice": {
      "amount": 899,
      "currency": "INR"
    },
    "flipkartSellingPrice": {
      "amount": 360,
      "currency": "INR"
    },
    "flipkartSpecialPrice": {
      "amount": 296,
      "currency": "INR"
    },
    "productUrl": "http://dl.flipkart.com/dl/rodid-solid-men-s-round-neck-grey-t-shirt/p/itmez6svjgsxdjck?pid=TSHENH9UGMUYZJZZ&affid=keensam04",
    "productBrand": "Rodid",
    "inStock": true,
    "codAvailable": true,
    "discountPercentage": 59,
    "offers": [
      "Extra 5% Off on Men's Clothing",
      "Casual Wear Under Rs.599",
      "Extra 10% Off on Fashion & Lifestyle",
      "Extra 5% off* on Axis Bank Buzz Credit Cards",
      "Extra 15% off* with digibank by DBS"
    ],
    "categoryPath": "Apparels>Men>Polos & T-Shirts",
    "attributes": {
      "size": "S",
      "color": "Charcoal Melange",
      "storage": "",
      "sizeUnit": "",
      "displaySize": ""
    }
  },
  "productShippingInfoV1": {
    "shippingCharges": {
      "amount": 40,
      "currency": "INR"
    },
    "estimatedDeliveryTime": "Usually Delivered in Thu Dec 01 23:59:59 IST 2016 - Fri Dec 02 23:59:59 IST 2016 days.",
    "sellerName": "Rahul",
    "sellerAverageRating": 3.8,
    "sellerNoOfRatings": 22031,
    "sellerNoOfReviews": 291
  },
  "categorySpecificInfoV1": {
    "keySpecs": [
      "Fabric: Cotton",
      "Regular Fit Round Neck T-shirt",
      "Pattern: Solid",
      "Sleeve Type: Narrow Full Sleeve"
    ],
    "detailedSpecs": [
      "Fabric: Cotton",
      "Regular Fit Round Neck T-shirt",
      "Pattern: Solid",
      "Sleeve Type: Narrow Full Sleeve"
    ],
    "specificationList": [
      {
        "key": "General",
        "values": [
          {
            "key": "Sales Package",
            "value": [
              "1 T Shirt"
            ]
          },
          {
            "key": "Pack of",
            "value": [
              "1"
            ]
          },
          {
            "key": "Style Code",
            "value": [
              "RODBN-CM"
            ]
          },
          {
            "key": "Neck Type",
            "value": [
              "Round Neck"
            ]
          },
          {
            "key": "Ideal For",
            "value": [
              "Men's"
            ]
          },
          {
            "key": "Size",
            "value": [
              "S"
            ]
          },
          {
            "key": "Pattern",
            "value": [
              "Solid"
            ]
          },
          {
            "key": "Sleeve",
            "value": [
              "Full Sleeve"
            ]
          },
          {
            "key": "Suitable For",
            "value": [
              "Western Wear"
            ]
          },
          {
            "key": "Brand Fit",
            "value": [
              "Regular"
            ]
          },
          {
            "key": "Fabric",
            "value": [
              "Cotton"
            ]
          },
          {
            "key": "Fit",
            "value": [
              "Regular"
            ]
          },
          {
            "key": "Sleeve Type",
            "value": [
              "Narrow"
            ]
          },
          {
            "key": "Reversible",
            "value": [
              "No"
            ]
          },
          {
            "key": "Fabric Care",
            "value": [
              "Machine wash cold, Wash dark colors separately, Do not bleach, Dry in shade, Tumble dry low, Do not dry clean, Use steam iron"
            ]
          }
        ]
      }
    ],
    "booksInfo": {
      "language": null,
      "binding": null,
      "pages": null,
      "publisher": null,
      "year": 0,
      "authors": []
    },
    "lifeStyleInfo": {
      "sleeve": "Full Sleeve",
      "neck": null,
      "idealFor": [
        "Men's"
      ]
    }
  }
}
```

PlaceOrder
```
{
  "discount": "20%",
  "coupon": "",
  "products": [
    {
      "productId": "",
      "price": {
        "amount": 899,
        "currency": "INR"
      }
    }
  ],
  "deliveryOption": "",
  "deliveryAddress": {
    "addressLine1": "",
    "addressLine2": "",
    "addressLine3": "",
    "landmark": "",
    "city": "",
    "state": "",
    "pinCode": "560066",
    "mobileNumber": ""
  }
}
```

Wallet
```
{
  "amount": 899,
  "currency": "INR"
}
```

OrderStatus
```
{
  "orderStatusCode": "InProcess",
  "orderStatusDescription": "In Process",
  "amountPaid": {
    "amount": 899,
    "currency": "INR"
  },
  "shareBuddies": [
    {
      "id": "",
      "name": "",
      "pic": "",
      "phoneNumer": "",
      "gender": "M",
      "rating": 5,
      "amountPaid": {
        "amount": 899,
        "currency": "INR"
      }
    }
  ]
}
```

InterestedBuddies
```
{
  "shareBuddies": [
    {
      "id": "",
      "name": "",
      "pic": "",
      "phoneNumer": "",
      "gender": "M",
      "rating": 5,
      "amountPaid": {
        "amount": 899,
        "currency": "INR"
      }
    }
  ]
}
```
Pair
Response same as InterestedBuddies
For Post URL = Pair?id=123,234,345
