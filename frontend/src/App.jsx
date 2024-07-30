
import React, { useState, useEffect } from 'react';
import Team from './Team.jsx'


import api from './api/axiosConfig.js'

function App() {

  const [teams, setTeams] = useState([]);

  const getTeams = async () => {

    try {
      const response = await api.get("/teams");
      console.log(response.data)
      setTeams(response.data);
    }
    catch (err) {
      console.log(err);
    }

  }

  useEffect(() => {
    getTeams();
  }, [])


  return (
    teams.map((team) => {
      return (
        <Team name={team.name} country={team.country} bike={team.bike_brand} />
      )

    })
  )




}

export default App
