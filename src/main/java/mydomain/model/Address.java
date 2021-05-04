package mydomain.model;

import javax.jdo.annotations.*;

@PersistenceCapable(detachable="true")
@FetchGroup(name="Address.all", members={@Persistent(name="id"), @Persistent(name="name")})
@FetchGroup(name="Address.pk", members={@Persistent(name="id")})
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public abstract class Address
{
    @PrimaryKey
    Long id;

    String name;

    public Address(long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
