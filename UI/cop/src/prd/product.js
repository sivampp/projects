import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as router, useFetcher } from 'react-router-dom';
import { useEffect } from 'react';
import axios from 'axios';

export default function Product (){

    const [data, setData] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const [emps, setEmps] = useState([]);

    useEffect(() => {
        axios.get(
            "http://parama.com:8081/cop/products",
            {
                headers: {
                    'Access-Control-Allow-Origin':'*',
                    'Access-Control-Allow-Methods':'GET'
                }
            }
        ).then((response) => {
            setData(response.data);
            setLoading(false);
        }).catch((err) => {
            setError(err.message);
            setLoading(false);
        })

        axios.get(
            "http://parama.com:8082/emp/employees",
            {
                headers: {
                    'X-CSRF-TOKEN':'qEKTZ-RIcCps220J_lX7O4G5jQ79qlXuhVedTzwz0Aaz707tynSmVoIrFRxB7lg5zXjPX7iOoGzPyGTD4Wf-KQkE4j-GjHuL',
                    'X-CSRFToken': 'qEKTZ-RIcCps220J_lX7O4G5jQ79qlXuhVedTzwz0Aaz707tynSmVoIrFRxB7lg5zXjPX7iOoGzPyGTD4Wf-KQkE4j-GjHuL',
                    'Access-Control-Allow-Origin':'*',
                    'Access-Control-Allow-Methods':'GET'
                }
            }
        ).then((response) => {
            console.log(response);
            setEmps(response.data);
            setLoading(false);
        }).catch((err) => {
            console.log(" Error in get employees",err);
            setError(err.message);
            setLoading(false);
        })
        

    }, []);
    
    return(
    <div>
        Product Details Section.
        { data.map((k) => (<li>{k.name +'    ' +k.id}</li>))}

        Employees Data :

        { emps.map((k) => (<li>{k.id +'    ' +k.firstName+'   '+k.lastName
            +'   '+k.salary}</li>))}
    </div>);
};