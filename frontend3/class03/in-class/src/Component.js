export default function Component({ title, description }) {
  console.log(title, description);
  return (
    <p>{title} - {description}</p>
  );
}
