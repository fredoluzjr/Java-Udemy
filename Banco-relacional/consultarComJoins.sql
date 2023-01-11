select * from cidades c inner join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id; -- ou left outer join
select * from cidades c right outer join prefeitos p on c.id = p.cidade_id; -- ou right join
-- select * from cidades c full join prefeitos p on c.id = p.cidade_id; -- MySQL não suporta o full join

-- para fazer o 'full join'
select * from cidades c left join prefeitos p on c.id = p.cidade_id
union
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

-- ou

select * from cidades c left join prefeitos p on c.id = p.cidade_id
union all
select * from cidades c right join prefeitos p on c.id = p.cidade_id;