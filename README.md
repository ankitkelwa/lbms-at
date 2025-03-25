# lbms-at
Assignment for LLD

Please Note I have taken 3 classes - Book, Patron and Reception

Book and Patron have the basic data and geter setter funcationality.

All the funcationallities are implemented at the Reception including add, remove and update of Book or Members.

The checkout function - 
searcher for isbn at the hash map and -1 the book quantity if membe Id doesn't have any current book.

The return function -
checks member id with corresponding isbn and update the quantity inBook Map and remove current book and add that isbn into the history attribute of that member ID.

Why used History in Patron?
To implement recommendation system on Patron/Member

Level of abstraction
The Book and Patron can be pure abstract as all the funcationality is provided at the reception or we can also assign a librarian which manages the records of books and Patrons/Members.


