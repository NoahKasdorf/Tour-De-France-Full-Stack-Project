import { Card, CardContent, Typography} from "@mui/material";

function Team(props){

    return (

    

    <Card sx={{ maxWidth: 345, margin: 1 }}>
      <CardContent>
        <Typography variant="h5" component="div">
          {props.name}
        </Typography>
        <Typography variant="body2" color="text.secondary">
          Country: {props.country}
        </Typography>
        <Typography variant="body2" color="text.secondary">
          Bike Sponsor: {props.bike}
        </Typography>
      </CardContent>
    </Card>


)

    }

export default Team