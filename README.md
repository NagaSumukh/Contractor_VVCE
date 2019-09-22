# Contractor_VVCE
This is a system for Contractor which helps contractor to do his daily routine  
He can Add Customers under him and for each Customer he can deploy any number of workers.  
Instructions:  
->Using Spring Tool Suite 3 this project can be run.   
->Now using the Embedded Apache Derby Database Contractors can be added through the chrome plugin "Postman"  
->Using Post method in Jason format we can add Details of the contractor and also customer under contractor  
->Using Get method we can get back the details of the list of the contractors and also the list of the customers under a particular contractor  
->The above is made possible by making the "ManyToOne" annotation which tells for a Contractor there are many Customers  
->Also now under customer will have the workers assigned by the contractor and the same above procedure is followed  
As of now we could'nt connect to the external database and the information is not being fetched by the HTML page rather it is being put manually  
For the future enchancement we have 2 Web pages ready and a database which is constructed using Mysql and the ER diagram corresponding to the ER diagram of the project is been made.  
