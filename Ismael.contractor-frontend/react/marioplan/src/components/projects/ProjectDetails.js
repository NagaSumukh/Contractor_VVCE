import React from "react";

const ProjectDetails = props => {
  const id = props.match.params.id;
  return (
    <div className="container section project-details">
      <div className="card z-depth-0">
        <div className="card-content">
          <span className="card-title">Project Title - {id} </span>
          <p>loremgjguyg ygugglugyfyffjjgfjjyyuuuyuyguuyuyugyuguygu</p>
        </div>
        <div className="card-action gret lighten-2 grey-text">
          <div>posted by bh</div>
          <div>23Semptember,12pm</div>
        </div>
      </div>
    </div>
  );
};
export default ProjectDetails;
