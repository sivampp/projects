import React, {useState} from 'react';

function Login(){

    const [username, setUsername] = useState('');
    const [password, setPassowrd] = useState('');
    const [error, setError] = useState('');

    const handleLogin = async (e) => {
        e.preventDefault();
        setError('');
    try {
        const response = await fetch('https://parama.com:8001/cop/login', {
            method:'POST',
            headers:{'content-type':'application/json'},
            body:JSON.stringify({username, password})
        });
        if(!response.ok){
            throw new Error('Invalid credentials');
        }
        const data = await response.json();
        localStorage.setItem('authToken',data.token);
        alert('Login Successful!');
        //redirect or update UI here
    }
    catch(err){ setError(err.message);}
    };
    
    return(
        <form>
            <h2>Login</h2>
            <input type='text' placeholder='Username' value={username}
            onChange={(e) => setUsername(e.target.value)} required/>

            <input type='password' placeholder='Password' value={password}
            onChange={(e) => setPassowrd(e.target.value)} required/>
            <button type='submit' >Login</button>
            {error && <p style={{color:'red'}}>{error}</p>}
        </form>
    );
} export default Login;