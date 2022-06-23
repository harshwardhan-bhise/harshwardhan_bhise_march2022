let datab=
{
	host:'localhost',
	user: 'root',
	password:'cdac',
	database:'cdac',
	port:3306
}
const express = require('express');
const app = express();
const cors = require('cors');
app.use(cors());
const mysql = require('mysql2')

const bodyParser = require('body-parser');
const database = require('mime-db');
const { prototype } = require('events');


const connection=mysql.createConnection(datab)
var result;



app.use(express.static('abc'));
app.use(bodyParser.json()); // support json encoded bodies
app.use(bodyParser.urlencoded({ extended: true }));
//whether you want nested objects support  or not



var result;

app.post('/#update', function (req, res) {
	
		//console.log("reading input " + req.body.v1 +  "  second " + req.body.v2)
		const{id,price}=req.query
		connection.query('update book price = ? where bookid = ?',[price,id],(err,res)=>{
			if(err){
				result="ID not found";
			}
			else{
				result="Price Updated Successfully"
			}
		})
        res.send(result);
    })


app.get('/poc2', function (req, res) {
    
	
        console.log("reading input " + req.query.xyz);
		
    	const{id,name,price}=req.body
		connection.query('select * from book where id=?',[id],(err,res)=>{
			if(err){
				result={
					status:"ID not found",
					msg:err
			}
		}
			else{
				result={
					status:"sucess",
					msg:res
				}
			}
		})

		res.send(result);

		});




app.listen(3000, function () {
    console.log("server listening at port 3000...");
});