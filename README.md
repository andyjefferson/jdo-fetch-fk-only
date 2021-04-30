# jdo-fetch-fk-only

Sample showing usage of the member metadata extension "fetch-fk-only" used on a 1-1 (FK) field requesting that any retrieval only pull back the FK and avoid the join to the related object (table). This will instantiate the related object but just not populate it (other than its identity field(s)).
