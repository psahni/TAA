1 - In an e-commerce system, the order information needs to be combined with the list of warehouses to identify the closest location. The list of warehouses is short and can be cached for long durations as it does not change often.

Thew API composition pattern will fit this scenario well, as the quantity of data being requested from the order microservice and warehouse microservice is small and we can also take advantage of in memory caching for additional optimisation.

2 - In an e-commerce store, a service needs to combine data for the hourly product and order data. The business is large , with a high number of orders per hour and a large number of products in its database.

Since the volume of data that needs to be loaded by the service is potentially very large, the API composition pattern is not a suitable candidate. A suitable solution would be to use event sourcing, and have this service subscribe to both product and order related events in order to keep an updated view of the required data whilst avoiding bulk data transfers that are both time consuming and also resource inefficient.