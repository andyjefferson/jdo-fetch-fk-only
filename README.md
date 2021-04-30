# jdo-fetch-fk-only

Sample showing usage of the member metadata extension "fetch-fk-only" used on a 1-1 (FK) field requesting that any retrieval only pull back the FK and avoid the join to the related object (table). This will instantiate the related object but just not populate it (other than its identity field(s)).

The query is
`SELECT FROM mydomain.model.Person`

which is compiled to
`SELECT 'mydomain.model.Person' AS DN_TYPE,A0.ADDRESS_ID_OID,A0.ID,A0."NAME" FROM PERSON A0`

So no JOIN is created. It then instantiates Person and Address objects.

    Object "mydomain.model.Person@455351c4" (id="mydomain.model.Person:1") added to Level 1 cache (loadedFlags="[NYN]")  
    Object "mydomain.model.Address@379ab47b" (id="mydomain.model.Address:1") added to Level 1 cache (loadedFlags="[YN]")  
    Object "mydomain.model.Address@379ab47b" (id="mydomain.model.Address:1") added to Level 2 cache (fields="[0]", version="")  
    Object "mydomain.model.Person@455351c4" (id="mydomain.model.Person:1") added to Level 2 cache (fields="[0, 1, 2]", version="")  
    p=Person [1] address=mydomain.model.Address@379ab47b  
